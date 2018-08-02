<html>
<head>
<style type="text/css">
td{
background:#CCC;
border:2px solid black;
}
</style>
</head>

<body>
<form action="formulario-completo-1.php" method="POST"></form>

<table>
<tr>
<td>Texto: </td>
<td><input type="text" name="Texto"><br></td>
<td>Password: </td>
<td><input type="password" name="Password"></td>
</tr>

<tr>
<td>Textarea: </td>
<td colspan="2"><textarea rows="10" cols="50" name="textarea"></textarea></td>
<td></td>
</tr>

<tr>
<td>
Opcion 1 <input type="checkbox" name="check1"><br>
Opcion 2 <input type="checkbox" name="check2"><br>
Opcion 3 <input type="checkbox" name="check3"><br>
</td>
<td>
Opcion 1 <input type="radio" name="radio1"><br>
Opcion 2 <input type="radio" name="radio2"><br>
</td>
<td>
Opciones: 
<select name="opciones">    
       <option value="select1" selected="selected">select1</option>
       <option value="select2">select2</option>
       <option value="select3">select3</option>
</select>
</td>
<td>
Opciones: 
<select multiple>
  <option value="multiple1">multiple1</option>
  <option value="multiple2">multiple1</option>
  <option value="multiple3">multiple1</option>
</select>
</td>
</tr>

</table>

<input type="submit" value="Confirmar">
<input type="reset" value="Limpiar">



</form>


</body>






</html>
