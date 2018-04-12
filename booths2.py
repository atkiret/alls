from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Firefox()
driver.get("http://localhost:5000")
elem = driver.find_element_by_name("text1")
elem1 = driver.find_element_by_name("text2")
driver.close()
