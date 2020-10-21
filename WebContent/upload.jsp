<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Uploading using Java</title>
</head>
<body>
	<div class="card-body">
		<div class="card-title">Add News</div>
		<hr>

		<form method="post"
			action="${pageContext.request.contextPath}/image/upload"
			encType="multipart/form-data">

			<div class="form-group">
				<label for="input-3">New</label> <input type="text"
					value="select images..." name = "textTemp"/>
			</div>

			<div class="form-group">
				<label for="input-3">Image</label> <input type="file" name="file"
					value="select images..." />
			</div>
			
			<input type="submit" value="start upload" />
		</form>
	</div>

</body>
</html>