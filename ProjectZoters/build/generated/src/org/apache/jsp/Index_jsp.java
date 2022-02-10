package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,maximum-scale=1\">\n");
      out.write("\t\t\n");
      out.write("\t\t<title>Movie Review | Single</title>\n");
      out.write("\n");
      out.write("\t\t<!-- Loading third party fonts -->\n");
      out.write("                <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,700|\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\t<link href=\"fonts/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\t\t<!-- Loading main css file -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"js/ie-support/html5.js\"></script>\n");
      out.write("\t\t<script src=\"js/ie-support/respond.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<div id=\"site-content\">\n");
      out.write("\t\t\t<header class=\"site-header\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" id=\"branding\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/logo.png\" alt=\"\" class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo-copy\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"site-title\">Company Name</h1>\n");
      out.write("\t\t\t\t\t\t\t<small class=\"site-description\">Tagline goes here</small>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a> <!-- #branding -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"main-navigation\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"menu-toggle\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item current-menu-item\"><a href=\"review.html\">Movie reviews</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"joinus.html\">Join us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul> <!-- .menu -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" class=\"search-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t\t<button><i class=\"fa fa-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t</form>n><i class=\"fa fa-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div> <!-- .main-navigation -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"mobile-navigation\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<main class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"page\">\n");
      out.write("\t\t\t\t\t\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\">Home</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"review.html\">Movie Review</a>\n");
      out.write("\t\t\t\t\t\t\t<span>The Croods</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure class=\"movie-poster\"><img src=\"dummy/single-image.jpg\" alt=\"#\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"movie-title\">The Croods</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-summary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. </p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit sed.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"movie-meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Rating:</strong> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"star-rating\" title=\"Rated 4.00 out of 5\"><span style=\"width:80%\"><strong class=\"rating\">4.00</strong> out of 5</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Length:</strong> 98 min</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Premiere:</strong> 22 March 2013 (USA)</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Category:</strong> Animation/Adventure/Comedy</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"starring\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Directors:</strong> Kirk de Mico (as Kirk DeMico). Chris Sanders</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Writers:</strong> Chris Sanders (screenplay), Kirk De Micco (screenplay)</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><strong>Stars:</strong> Nicolas Cage, Ryan Reynolds, Emma Stone</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div> <!-- .row -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"entry-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ac pharetra libero. Integer in suscipit diam, sit amet eleifend nunc. Curabitur egestas nunc nulla, in aliquet risus efficitur quis. Vivamus facilisis est libero, vitae iaculis nulla cursus in. Suspendisse potenti. In et fringilla ipsum, quis varius quam. Morbi eleifend venenatis diam finibus vehicula. Suspendisse eu blandit metus. Sed feugiat pellentesque turpis, in lacinia ipsum. Vivamus nec luctus orci.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Aenean vehicula eget risus sit amet posuere. Maecenas id risus maximus, malesuada leo eget, pellentesque arcu. Phasellus vitae leo rhoncus, consectetur mauris vitae, lacinia quam. Nunc turpis erat, accumsan eget justo quis, auctor ultricies magna. Mauris sodales, risus sit amet hendrerit tincidunt, erat ante facilisis sapien, sit amet maximus neque massa a felis. Nullam consectetur justo massa, vel commodo metus gravida in. Aliquam erat volutpat. Nullam a lorem sed lorem euismod gravida a eu velit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec venenatis ac ligula vel pharetra. Aenean vitae nulla sed dui volutpat euismod. Nam ex quam, consequat id rutrum sed, porttitor id lectus. Vestibulum venenatis consectetur justo ut sagittis. Duis dignissim tincidunt quam, nec pulvinar libero luctus nec. Morbi blandit nec lorem in ullamcorper.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Vestibulum et odio massa. Integer at odio ipsum. Proin vitae tristique nibh. Aenean semper ante sit amet ante ultricies tincidunt. Curabitur cursus, urna non ultricies posuere, dolor lacus cursus lorem, a dapibus nibh ex eget sem. Aliquam semper sagittis sapien a fermentum. Nullam sed iaculis lacus, et imperdiet risus. Praesent quis turpis ac nunc sodales tincidunt. Aliquam at leo odio. Sed a tempor nisl, et mattis felis. Nam mauris nunc, commodo ac orci ut, auctor viverra mauris.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Quisque nec justo vitae metus consectetur ultrices. Duis venenatis lorem massa, eu pulvinar quam faucibus sed. Nulla fringilla lorem sit amet sagittis mattis. Nunc in leo a odio mollis consectetur. Etiam ac nisl eget diam ullamcorper porta. Aliquam consectetur neque eget metus egestas sollicitudin. Curabitur ultrices urna et feugiat malesuada.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Nulla facilisi. Fusce sed dapibus leo, eu lobortis ante. Duis luctus mauris in ante semper, ut feugiat nisi condimentum. Nullam a odio et justo suscipit tempus. Vestibulum placerat dapibus quam, a egestas turpis efficitur id. Integer suscipit placerat placerat. Phasellus in lorem quis leo egestas accumsan. Nam et euismod ligula. Duis nec erat aliquam, sollicitudin diam non, ornare leo. Pellentesque augue leo, faucibus in nunc nec, tincidunt ullamcorper tortor. Phasellus aliquam condimentum elit. Nulla facilisi. Donec magna libero, bibendum eu faucibus et, mattis at felis. Integer turpis nibh, blandit nec elit vel, euismod laoreet quam. Donec vel ante nisi. Nunc luctus a tellus non.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <section class=\"content-item\" id=\"comments\">\n");
      out.write("    <div class=\"container col-sm-11\">   \n");
      out.write("    \t<div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1\">   \n");
      out.write("                <form>\n");
      out.write("                \t<h3 class=\"pull-left\">New Comment</h3>\n");
      out.write("                \t<button type=\"submit\" class=\"btn btn-normal pull-right\">Submit</button>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3 col-lg-2 hidden-xs\">\n");
      out.write("                            \t<img class=\"img-responsive\" id=\"avatar\" src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-xs-12 col-sm-9 col-lg-10\">\n");
      out.write("                                <textarea class=\"form-control\" id=\"message\" placeholder=\"Your message\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \t\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <h3>4 Comments</h3>\n");
      out.write("                \n");
      out.write("                <!-- COMMENT 1 - START -->\n");
      out.write("                <div class=\"media\">\n");
      out.write("                    <a class=\"pull-left\" href=\"#\"><img class=\"media-object\" src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"\"></a>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h4 class=\"media-heading\">John Doe</h4>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                        <ul class=\"list-unstyled list-inline media-detail pull-right\">\n");
      out.write("                            <li class=\"\"><a href=\"\">Delete</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- COMMENT 1 - END -->\n");
      out.write("                \n");
      out.write("                <!-- COMMENT 2 - START -->\n");
      out.write("                <div class=\"media\">\n");
      out.write("                    <a class=\"pull-left\" href=\"#\"><img class=\"media-object\" src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" alt=\"\"></a>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h4 class=\"media-heading\">John Doe</h4>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- COMMENT 2 - END -->\n");
      out.write("                \n");
      out.write("                <!-- COMMENT 3 - START -->\n");
      out.write("                <div class=\"media\">\n");
      out.write("                    <a class=\"pull-left\" href=\"#\"><img class=\"media-object\" src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" alt=\"\"></a>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h4 class=\"media-heading\">John Doe</h4>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- COMMENT 3 - END -->\n");
      out.write("                \n");
      out.write("                <!-- COMMENT 4 - START -->\n");
      out.write("                <div class=\"media\">\n");
      out.write("                    <a class=\"pull-left\" href=\"#\"><img class=\"media-object\" src=\"https://bootdey.com/img/Content/avatar/avatar4.png\" alt=\"\"></a>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h4 class=\"media-heading\">John Doe</h4>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- COMMENT 4 - END -->\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div> <!-- .container -->\n");
      out.write("\t\t\t</main>\n");
      out.write("\t\t\t<footer class=\"site-footer\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">About Us</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia tempore vitae mollitia nesciunt saepe cupiditate</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Recent Review</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Help Center</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Join Us</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Social Media</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Facebook</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Twitter</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Google+</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Pinterest</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Newsletter</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" class=\"subscribe-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Email Address\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!-- .row -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"colophon\">Copyright 2014 Company name, Designed by Themezy. All rights reserved</div>\n");
      out.write("\t\t\t\t</div> <!-- .container -->\n");
      out.write("\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Default snippet for navigation -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/plugins.js\"></script>\n");
      out.write("\t\t<script src=\"js/app.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}