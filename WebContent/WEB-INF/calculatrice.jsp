<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculatrice</title>
</head>
<style>

<%@ include file = "style.css"%>


</style>

<body>

<form method="post">
 
 
 <CENTER>
	
<h1>*** TP JSP  -  OpenClassRoom ***  </h1>
<table width="30%" border = "-1"  >

	<tr>
	<td colspan =3 align =center><h1> CALCULATRICE</h1>	 </td> 
	</tr>
 	 
  	 <!-- LES CHAMPS -->
	<tr>
		<td width =33% align = center>VALEUR A</td>
		<td width =33% align = center> VALEUR B</td>
		<td width =50% align = center>TYPE D'OPERATEUR</td>
	</tr>

	<!-- LES CHAMPS A REMPLIR -->
	<tr>
	<td width =33% align = center> <input type = "text" name = "x" size = 30 ></td>
	<td width =33% align = center><input type = "text" name = "y" size = 30> </td>
    <td  width =33% align = center> <select name = "Operator" >
    		<option  >+</option>
    		<option>-</option>
 			<option>*</option>
 			<option>/</option></select> </td>
	</tr>
 	 
	<!--MESSAGES ERREURS -->	
	<tr>
	<td width =33% align = center style = "color:red;">${   !empty xErreur ? 'Champ A est Vide !' :  ''  }</td>
	<td width =33% align = center style = "color:red;">${   !empty yErreur ? 'Champ B est Vide !' :  ''  }</td>
	</tr>

 
 	<!--BUTTONS -->	
 	<tr>
	<td width =33% align = center><input type = "reset" value = "RAZ" > </td>
	<td width =33% align = center> <input type = "submit" value = "Envoyer" > </td>
	</tr>	
 	<tr><td colspan =3 align =center style = "color:red;"> ${ empty e ? '': 'ERREUR SAISIE NUMERIQUE !!!' } 	</td>	
	</tr>
 	 		
	 
	<tr>
	<td colspan =3 align =center style = "color:blue;">
 
 	<!-- AFFICHAGE DU RESULTAT -->
	<h2>${ !empty envoiReponse ? envoiReponse : ' ' }<h2>
		  
	</td>	
	</tr>
 	 		
				</table>
			</CENTER>
		</form>
	</body>
</html>