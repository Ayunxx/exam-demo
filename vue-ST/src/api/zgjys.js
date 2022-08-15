import request from '@/utils/request'

export default{
    //数据字典列表
    req_getRandTopic(){
        return request({
            url:`/politics/getRandTopic`,
            method: 'get'
        })
    },
    req_getTopic(){
        return request({
            url:`/politics/getTopic`,
            method: 'get'
        })
    },

}