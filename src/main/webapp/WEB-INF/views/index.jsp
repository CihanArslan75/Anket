<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" pageEncoding="UTF-8"%>

<html lang="tr" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core"
	xmlns:p="http://primefaces.org/ui"
	xmlns:c="http://java.sun.com/jsp/jstl/core">

<h:head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
	

    <title>SATIŞ SİTESİ | Admin Panel </title>

  
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/bootstrap/dist/css/bootstrap.min.css?ln=css" />
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/font-awesome/css/font-awesome.min.css?ln=css" /> 
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/nprogress/nprogress.css?ln=css" />
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/iCheck/skins/flat/green.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/google-code-prettify/bin/prettify.min.css?ln=css" />
    <link type="text/css" rel="stylesheet"	href="resources/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/jqvmap/dist/jqvmap.min.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/bootstrap-daterangepicker/daterangepicker.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/build/css/custom.min.css?ln=css" />

</h:head>

<h:body class="nav-md">
 <h:form id="frmdefault">
<div class="hide">
	   <h:commandButton id="btnurl" type="submit" value="URL ver" action="#{indexBean.urlVer}"/> 
	   <h:inputText id="txturl" value="#{indexBean.id}"/>
	</div>
 <div class="container body">
      <div class="main_container">
         <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-shopping-cart"></i> <span>Satış Paneli</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="resources/images/img.jpg" alt="..." class="img-circle profile_img" />
              </div>
              <div class="profile_info">
                <span>Hoşgeldin,</span>
         		  <h2><h:outputLabel value="#{staticValues.user}"></h:outputLabel></h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>YÖNETİM</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Tasarım Ayarları <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.html">Header İmage</a></li>
                      <li><a href="index2.html">Logo</a></li>
                   
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Ürün Tanımları <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#" onclick="url(1)">Kategori Tanımlama</a></li>
                      <li><a href="#" onclick="url(2)">Ürün Tanımlama</a></li>
                      <li><a href="#" onclick="url(3)">Fiyat İşlemleri</a></li>
                 
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i> Satış İşlemleri <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#" onclick="url(4)">Satışı Yapılan Ürünler</a></li>
                      <li><a href="#" onclick="url(5)">Stok İşlemleri</a></li>
                      <li><a href="#" onclick="url(6)">Onayda ki Ürünler</a></li>
                     
                    </ul>
                  </li>
                 <li><a><i class="fa fa-desktop"></i> Özel İşlemler <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#" onclick="url(7)">Excel den Ürün Yükleme</a></li>
                      <li><a href="#" onclick="url(8)">Ürünleri XML e Aktar</a></li>
                      <li><a href="#" onclick="url(9)">PDF Olarak Rapor  Çıkart</a></li>
                      <li><a href="slider.jsf?faces-redirect=true">Slider</a></li>
                     
                    </ul>
                  </li>
                </ul>
              </div>
              
              </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="resources/images/img.jpg" alt="" />John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
      
      
   <!-- page content -->
        <div class="right_col" role="main">
          <ui:include src="#{indexBean.url}" />
      <!--  -->  
      
         <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
 </div>

	<script type="text/javascript" src="resources/vendors/jquery/dist/jquery.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap/dist/js/bootstrap.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/fastclick/lib/fastclick.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/nprogress/nprogress.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Chart.js/dist/Chart.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/gauge.js/dist/gauge.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/iCheck/icheck.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/skycons/skycons.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.pie.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.time.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.stack.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.resize.js?ln=js"></script>
	
	<script type="text/javascript" src="resources/vendors/flot.orderbars/js/jquery.flot.orderBars.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/flot-spline/js/jquery.flot.spline.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/flot.curvedlines/curvedLines.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/DateJS/build/date.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/dist/jquery.vmap.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/dist/maps/jquery.vmap.world.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/moment/min/moment.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap-daterangepicker/daterangepicker.js?ln=js"></script>
	<script type="text/javascript" src="resources/build/js/custom.min.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/jquery.tagsinput/src/jquery.tagsinput.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/jquery.hotkeys/jquery.hotkeys.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/google-code-prettify/src/prettify.js?ln=js"></script>
   <script>
  function url(id){
	  document.getElementById("frmdefault:txturl").value=id;
	  document.getElementById("frmdefault:btnurl").click();
  }
  
  </script>
  
  </h:form>
</h:body>


</html>
