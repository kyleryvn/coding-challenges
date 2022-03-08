import requests
import re


def get_topic(topic):
    response = requests.get(
        'https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=' + topic)
    data = response.json()

    return len(re.findall(topic, data['parse']['text']['*'], re.IGNORECASE))
