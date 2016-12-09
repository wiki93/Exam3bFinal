<div class="row">
    <div class="col-xs-12">
        <div class="navbar-inverse">
            <div class="container-fluid">
                <ul class="nav nav-pills">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="adminRead">View all Customers</a></li>
                    <li><a href="add">Add New Customer</a></li>
                    <li><a href="./Admin/admin.jsp"> Admin </a></li>
                </ul>
            </div> 
        </div>
    </div>
</div>
<div class="row">
    <div class="col-xs-12">
        <form name ="searchForm" action="adminSearch" method="get">
            <input type="text" name="searchVal" value="" />
            <input type="submit" name="submit" value="Search all Customers" /><br><br>
        </form>
    </div>
</div>