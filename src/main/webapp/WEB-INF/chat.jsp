<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layim - layui</title>

<link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css">
<style>
html{background-color: #D9D9D9;}
</style>
</head>
<body>

<div style="margin: 300px auto; text-align: center; font-size: 20px;">
  <a href="http://layim.layui.com/demo.html">前去看官方演示</a>
</div>

<script src="${pageContext.request.contextPath }/layui/layui.js"></script>

<script>
layui.use('layim', function(layim){

	var socket = new WebSocket('ws://localhost:8080/layim/SocketServer');
	
  //连接成功时触发
  socket.onopen = function(){
    alert("连接成功");
  };
	
	  //监听收到的消息
  socket.onmessage = function(res){
    //res为接受到的值，如 {"emit": "messageName", "data": {}}
    //emit即为发出的事件名，用于区分不同的消息
  };
  
  //基础配置
  layim.config({
  
    //获取主面板列表信息
    init: {
      url: 'http://localhost:8080/layim/getList' //接口地址（返回的数据格式见下文）
      ,type: 'get' //默认get，一般可不填
      ,data: {} //额外参数
    }
    
    //获取群员接口
    ,members: {
      url: './json/getMembers.json' //接口地址（返回的数据格式见下文）
      ,type: 'get' //默认get，一般可不填
      ,data: {} //额外参数
    }
    
    //上传图片接口（返回的数据格式见下文）
    ,uploadImage: {
      url: '' //接口地址（返回的数据格式见下文）
      ,type: 'post' //默认post
    } 
    
    //上传文件接口（返回的数据格式见下文）
    ,uploadFile: {
      url: '' //接口地址（返回的数据格式见下文）
      ,type: 'post' //默认post
    } 
    
    //增加皮肤选择，如果不想增加，可以剔除该项
    ,skin: [ 
      'http://xxx.com/skin.jpg', 
    ] 
    
    ,brief: false //是否简约模式（默认false，如果只用到在线客服，且不想显示主面板，可以设置 true）
    ,title: '我的LayIM' //主面板最小化后显示的名称
    ,min: false //用于设定主面板是否在页面打开时，始终最小化展现。默认false，即记录上次展开状态。
    ,minRight: null //【默认不开启】用户控制聊天面板最小化时、及新消息提示层的相对right的px坐标，如：minRight: '200px'
    ,maxLength: 3000 //最长发送的字符长度，默认3000
    ,isfriend: true //是否开启好友（默认true，即开启）
    ,isgroup: true //是否开启群组（默认true，即开启）
    ,right: '0px' //默认0px，用于设定主面板右偏移量。该参数可避免遮盖你页面右下角已经的bar。
    ,chatLog: '/chat/log/' //聊天记录地址（如果未填则不显示）
    ,find: '/find/' //查找好友/群的地址（如果未填则不显示）
    ,copyright: true //是否授权，如果通过官网捐赠获得LayIM，此处可填true
  });
});      
</script>
</body>
</html>
