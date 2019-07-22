<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.wrap{
		width:400px;
		height:400px;
	}
	.box{
		width:40px;
		height:40px;
		border:  1px solid gray;
		box-sizing:border-box;
		float:left;
		background-color:black;
	}
</style>
</head>
<body>
	<div class="wrap">	
		<%for (int i = 0; i < 100; i++){ %>
			<div class="box" id="<%=i%>" onclick="lightClick(this)"></div>
		<%}%>
	</div>
	<script>
		function lightClick(light){
			findLights(light);
		}
		function findLights(light){
			turnLight(light);
			var topId = light.id - 10;
			turnLight(document.getElementById(topId));
			var rightId = parseInt(light.id) + 1 ;
			turnLight(document.getElementById(rightId));
			var upId = parseInt(light.id) + 10 ;
			turnLight(document.getElementById(upId));
			var leftId = light.id - 1;
			turnLight(document.getElementById(leftId));
		}
		function turnLight(light){
			if(light.style.backgroundColor != "yellow"){
				light.style.backgroundColor = "yellow";
			} else{
				light.style.backgroundColor = "black";
			}
		}
	</script>
</body>
</html>