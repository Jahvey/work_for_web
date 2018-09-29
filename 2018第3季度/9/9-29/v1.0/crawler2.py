# -*- coding: utf-8 -*-
"""
Created on Sat Sep 29 15:33:39 2018

@author: cwalk
"""
from bs4 import BeautifulSoup 
import requests
import time

url='https://bj.58.com/pingbandiannao/35353501847632x.shtml'

def get_links_from(who_sells=0):
    urls=[]
    list_view='https://bj.58.com/pbdn/{}/'.format(str(who_sells))
    wb_data=requests.get(list_view)
    soup=BeautifulSoup(wb_data.text,'lxml')
    for link in soup.select('td.t > a.t'):
        urls.append(link.get('href').split('?')[0])  
    #print(urls)
    return urls

def get_views_from(url):
    id=url.split('/')[-1].strip('x.shtml')
    #print(id)
    api='https://jst1.58.com/counter?infoid={}&userid=&uname=&sid=0&lid=0&px=0&cfpath='.format(id)
    js=requests.get(api)
    #js.text为返回结果 respones
    #print(js.text)
    views=js.text.split('=')[-1]
    #print(views)
    return views
    

def get_item_info(who_sells=1):
    
    urls=get_links_from(who_sells)
    for url in urls:
        wb_data=requests.get(url)
        
        soup=BeautifulSoup(wb_data.text,'lxml')
        data={
            'title':soup.title.text,
            'price':soup.select('.price')[0].text,
            'area':list(soup.select('.c_25d')[0].stripped_strings),
            'date':soup.select('.time')[0].text,
            'cate':'个人' if who_sells==0 else '商家',
            'views':get_views_from(url)
            
            
        }
        print(data)

#print(soup)
#get_links_from()
#get_views_from(url)
        
get_item_info()