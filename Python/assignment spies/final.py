from os import replace
import re
import os
import urllib.request

import requests
import webbrowser

def get_links(path):
    file = open(path, 'r', encoding='utf-8')
    file_text = file.read()

    file.close()

    matches = re.findall(r'GET (/.+)+ HTTP', file_text)
    final_matches = list()
    for i in matches:
      if i[:9] == '/cyberbit':
          final_matches.append(i)
    
    final_matches = list(dict.fromkeys(final_matches))
    final_matches = sorted(final_matches)
    final = list()
    for i in final_matches:
      final.append('https://cyber-blich-bitballoon.herokuapp.com' + i)
      
    return final



def get_images():
    if not(os.path.isdir('/Volumes/Elad Press/Programming/Python/assignment spies/images')):
        os.makedirs('/Volumes/Elad Press/Programming/Python/assignment spies/images')

        ls = get_links('log_suspect1.cyberbit.log.txt')

        image_count = 0
        for url in ls:
            status = requests.get(url)
            if status.status_code == 200:
                tmp_jpg = open("images/img" + str(image_count) + ".jpg", "wb")
                tmp_jpg.write(status.content)
                tmp_jpg.close()
                image_count = image_count + 1



def open_full_image():
    index = open('images/index.html', 'wt')
    text = '''
    <html>
        <body>
    '''
    for file in os.listdir('/Volumes/Elad Press/Programming/Python/assignment spies/images'):
        text += '<img src = "' + file + '">'
    text += '''</body>
    </html>
    '''
    index.write(text)
    index.close()


    name = 'file://' + os.path.abspath(index.name)
    webbrowser.open_new_tab(name)
#matches = re.findall(r'GET cyberbit\/(/.+)+ HTTP', file_text)



get_images()
open_full_image()
#for i in final_matches:
  # print(i + '\n')




