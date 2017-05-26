<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user/getnewapp.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$.ajax({  
    type:"get",     
    url: "${pageContext.request.contextPath}/user/getnewappjsp",  
    data:{"jgbh":1},  
    dataType:"json",  
    success : function(data) {  
    	$("div#policeInfos").html(""); 
       alert(data);  
      /*  var vendorJson = eval(data);//把json数据转换为字符串  
       //拼接机构下人员信息  
       alert($("div#policeInfos").html());
       $("div#policeInfos").html("");  
       var _htmls="<div style='line-height:20px;'>";  
       $.each(vendorJson,function (index , item ) {  
       //注意这里通过后台传递的key值获得对应的value值，前后必须保持一致，否则获得不了值  
		//alert("rybh:"+item.rybh); alert("xm:"+item.xm);  
		 _htmls+="<span style='margin-left:20px;'><input  style='margin:5px;'  type='checkbox' name='rybh' value='"+item.rybh+"'/>"+item.xm+"</span>";  
		       });  
		        _htmls+="</div>";     
		       $("div#policeInfos").html(_htmls);  */ 
		    }// end success  
		});// end ajax

		
	  $("#btn1").click(function(){
	    alert("Text: " + $("#div").text());
	  });
	  $("#btn2").click(function(){
	    $("#span").text("/js/user/getnewapp.js");

	    $.ajax({  
	        type:"get",     
	        url: "${pageContext.request.contextPath}/user/getnewapp",  
	        data:{"jgbh":1},  
	        dataType:"json",  
	        success : function(data) {  
		        alert(JSON.stringify(data.data[0]));
	        	$("div#policeInfos").html(""); 
	          var vendorJson = eval(data.data);//把json数据转换为字符串  
	           //拼接机构下人员信息  
	           $("div#policeInfos").html("");  
	           var _htmls="<div style='line-height:20px;'>";  
	           $.each(vendorJson,function (index , item ) {
	           //注意这里通过后台传递的key值获得对应的value值，前后必须保持一致，否则获得不了值  
	    		//alert("rybh:"+item.rybh); alert("xm:"+item.xm);  
	    		 _htmls+="<span style='margin-left:20px;'><input  style='margin:5px;'  type='checkbox' name='rybh' value='"+item.name+"'/>"+item.id+"</span>";  
	    		       });  
	    		        _htmls+="</div>";     
	    		       $("div#policeInfos").html(_htmls);  
	    	},// end success 
	        error : function(XMLResponse) {
		        alert(XMLResponse.responseText);
		    } 
	    });// end ajax
		
	  });
	});


</script>
</head>
<body>
<h1>asdsadsadsad</h1>
哟哟哟:${requestScope.message}<br/>

      ----数据：${requestScope.user.name}-<br/>
      ----dada数据：${requestScope.users[0].name}-<br/>
   
<div id="div">123</div>
<button id="btn1">显示文本</button>
<button id="btn2">显示 HTML</button><br>
<span id="span">111</span><br/>
<div id="policeInfos">yoyoyyoyoy</div>
</body>
</html>