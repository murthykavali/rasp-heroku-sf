package service;

import org.joda.time.DateTime;
import util.Constants;
import util.ImageFormat;
import util.api.ChartOptions;
import util.api.Series;
import util.api.shared.SeriesType;
import util.api.utils.JsonArray;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class TrafficImageGeneratorHelper {
    public static final String HIT_COUNT = "HitCount__c";
    public static final String TIME_STAMP = "TimeStamp__c";

    public static String getImagePath() {
        Map map = UpdateSalesforce.querySF(SalesforceHelper.getContext(false));
        return generateImageFromInput(map);
    }

    private static String generateImageFromInput(Map map) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        ChartOptions chartOptions = createChartOption();
        Series newSeries = new Series().setName(" ");

        final JsonArray<Object> seriesValues = new JsonArray<>();

        if (map != null && map.size() > 0) {

            Object records = map.get("records");
            if (records instanceof List) {
                List<Object> recordsList = (List) records;
                for (Object record : recordsList) {
                    if (null != record && record instanceof Map) {
                        Map<String, Object> mapRecord = (Map) record;
                        Double hitCount = (Double) mapRecord.get(HIT_COUNT);
                        DateTime TimeStamp__c = DateTime.parse((String) mapRecord.get(TIME_STAMP));
                        String displayDate = Constants.TIME_FORMATTER.print(TimeStamp__c);
                        chartOptions.getXAxis().getCategories().pushString(displayDate);
                        seriesValues.pushElement(hitCount);
                    }

                }
            }
        }
        newSeries.setDataAsObject(seriesValues);
        chartOptions.getSeries().pushElement(newSeries);
        return generateImage(chartOptions);
    }


    private static String generateImage(ChartOptions chartOptions) {
        ImageGenerator instance = ImageGenerator.getInstance();
        return instance.generate(chartOptions, ImageFormat.PNG, 400);
    }

    private static ChartOptions createChartOption() {
        ChartOptions chartOptions = new ChartOptions();

        chartOptions.getCredits().setEnabled(false);
        chartOptions.getChart().setDefaultSeriesType(SeriesType.COLUMN).setWidth(550).
                setHeight(300).setMarginRight(30).setMarginLeft(50).setMarginTop(20).setMarginBottom(5);

        chartOptions.getTitle().setText("");
        chartOptions.getSubtitle().setText("");

        return chartOptions;
    }

}
