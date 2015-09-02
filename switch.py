import RPi.GPIO as GPIO
import time
import requests
import json


GPIO.setmode(GPIO.BCM)

GPIO.setup(16, GPIO.IN, pull_up_down=GPIO.PUD_UP)

while True:
    input_state = GPIO.input(16)
    if input_state == False:
        print('Button Pressed')
	url = "https://rasp-heroku.herokuapp.com/traffic/getSnapshot"
	r = requests.get(url)

	print r

        time.sleep(0.5)