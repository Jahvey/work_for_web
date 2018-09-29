# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
from bs4 import BeautifulSoup
import requests
import time
"""
这个只是油管beautifulSoup的测试
ps:python真香

"""
url='https://knewone.com/discover?page='

#获取多页的主方法 提取出来
def get_page(url,data=None):
    wb_data=requests.get(url)
    soup=BeautifulSoup(wb_data.text,'lxml')
    imgs=soup.select('a.cover-inner > img')
    titles=soup.select('section.content > h4 > a')
    links=soup.select('section.content  > h4 > a')
    
    if data==None:
        for img,title,link in zip(imgs,titles,links):
            data={
                'img':img.get('src'),
                'title':title.get('title'),
                'link':link.get('href')
            }
            print(data)

#得到更多的数据 使用循环来获取 每次获取一个页面 都要等待3s
def get_more_pages(start,end):
    for one in range(start,end):
        get_page(url+str(one))
        time.sleep(3)
    

#运行整个项目
get_more_pages(1,10)

#print(soup)