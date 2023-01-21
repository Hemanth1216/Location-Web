
<%@ include file="common/headers.jspf"%>

	<div class="container">
		<h2>All Locations</h2>
		<table class="table">
			<thead>
				<tr>
					<th>id</th>
					<th>Code</th>
					<th>Name</th>
					<th>Type</th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${locations}" var="loc">
					<tr>
						<td>${loc.id}</td>
						<td>${loc.code}</td>
						<td>${loc.name}</td>
						<td>${loc.type}</td>
						<td><a href="show-update?id=${loc.id}" class="btn btn-primary">Edit</a></td>
						<td><a href="delete-location?id=${loc.id}" class="btn btn-danger">Delete</a></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<a href="show-create" class="btn btn-success">Add location</a>
	</div>
	<%@ include file="common/footers.jspf"%>
	