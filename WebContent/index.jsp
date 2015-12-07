<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/demo.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/esayui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/esayui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
<title>DNF 伤害值计算</title>
</head>
<body>
	<div align="center">
		<select id="zhiyexuanzhe" class="easyui-combobox" name="zhiyexuanzhe" style="width:200px;">   
			<option value="baifenbizhiye">百分比职业</option>
			<option value="dulizhiye">独立职业</option>
		</select>
	</div>
	<form id="baifenbiform" method="post" action="Damage">
		<div align="center">
			<table>
				<tr>
					<th><label class="">原有攻击</label></th>
					<td><input class="easyui-validatebox" type="text" name="oldgongji" data-options="required:true" /></td>
					<th><label>攻击</label></th>
					<td><input class="easyui-validatebox" type="text" name="gongji" data-options="required:true" /></td>
				</tr>
				<tr>
					<th><label>原有力量</label></th>
					<td><input class="easyui-validatebox" type="text" name="oldpower" data-options="required:true" /></td>
					<th><label>力量</label></th>
					<td><input class="easyui-validatebox" type="text" name="power" data-options="required:true" /></td>
				</tr>
				<tr>
					<th><label>原有无视</label></th>
					<td><input class="easyui-validatebox" type="text" name="oldwushi" data-options="required:true" /></td>
					<th><label>无视</label></th>
					<td><input class="easyui-validatebox" type="text" name="wushi" data-options="required:true" /></td>
				</tr>
				<tr>
					<th><label>原有属性强化值</label> </th>
					<td> <input class="easyui-validatebox" type="text" name="oldshuxin" data-options="required:true" /></td>
					<th><label>属性强化值</label> </th>
					<td> <input class="easyui-validatebox" type="text" name="shuxin" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有附加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldfujia" data-options="required:true" /></td>
					<th> <label>附加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="fujia" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldzengjia" data-options="required:true" /></td>
					<th> <label>增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="zengjia" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有暴击增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldbaoji" data-options="required:true" /></td>
					<th> <label>暴击增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="baoji" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有暴击率</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldbaojilv" data-options="required:true" /></td>
					<th> <label>暴击率</label></th>
					<td> <input class="easyui-validatebox" type="text" name="baojilv" data-options="required:true" /></td>
				</tr>
			</table>
			
		</div>
		<div align="center">
			<input type="submit" class="easyui-linkbutton" id="do" name="do" value="submit"></input>
			<label>比原来提升了：</label><input id="result" name="result"><label>的伤害</label>
		</div>
	</form>
	<form id="duliform" method="post" action="Damage">
		<div align="center">
			<table>
				<tr>
					<th><label>原有力量</label></th>
					<td><input class="easyui-validatebox" type="text" name="oldpower" data-options="required:true" /></td>
					<th><label>力量</label></th>
					<td><input class="easyui-validatebox" type="text" name="power" data-options="required:true" /></td>
				</tr>
				<tr>
					<th><label>原有独立</label></th>
					<td><input class="easyui-validatebox" type="text" name="oldduli" data-options="required:true" /></td>
					<th><label>独立</label></th>
					<td><input class="easyui-validatebox" type="text" name="duli" data-options="required:true" /></td>
				</tr>
				<tr>
					<th><label>原有属性强化值</label> </th>
					<td> <input class="easyui-validatebox" type="text" name="oldshuxin" data-options="required:true" /></td>
					<th><label>属性强化值</label> </th>
					<td> <input class="easyui-validatebox" type="text" name="shuxin" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有附加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldfujia" data-options="required:true" /></td>
					<th> <label>附加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="fujia" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldzengjia" data-options="required:true" /></td>
					<th> <label>增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="zengjia" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有暴击增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldbaoji" data-options="required:true" /></td>
					<th> <label>暴击增加伤害</label></th>
					<td> <input class="easyui-validatebox" type="text" name="baoji" data-options="required:true" /></td>
				</tr>
				<tr>
					<th> <label>原有暴击率</label></th>
					<td> <input class="easyui-validatebox" type="text" name="oldbaojilv" data-options="required:true" /></td>
					<th> <label>暴击率</label></th>
					<td> <input class="easyui-validatebox" type="text" name="baojilv" data-options="required:true" /></td>
				</tr>
			</table>
		</div>
		<div align="center">
			<input type="submit" class="easyui-linkbutton" id="do1" name="do1" value="submit"></input>
			<label>比原来提升了：</label><input id="result1" name="result1"><label>的伤害</label>
		</div>
	</form>

</body>
</html>