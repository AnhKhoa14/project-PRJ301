package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>Login Page</title><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("            <style>\n");
      out.write("                body {\n");
      out.write("                    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                    background-color: rgba(255, 1, 1, 0.1)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .card {\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 0;\n");
      out.write("                    width: 420px !important;\n");
      out.write("                    margin: 0 auto\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .signup {\n");
      out.write("                    display: flex;\n");
      out.write("                    flex-flow: column;\n");
      out.write("                    justify-content: center;\n");
      out.write("                    padding: 10px 50px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a{\n");
      out.write("                    text-decoration:none !important;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                h5 {\n");
      out.write("                    color: #ff0147;\n");
      out.write("                    margin-bottom: 3px;\n");
      out.write("                    font-weight: bold\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                small {\n");
      out.write("                    color: rgba(0, 0, 0, 0.3)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input {\n");
      out.write("                    width: 10%;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    margin-bottom: 7px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form-control {\n");
      out.write("                    border: 1px solid #dc354575;\n");
      out.write("                    border-radius: 30px;\n");
      out.write("                    background-color: rgba(0, 0, 0, .075);\n");
      out.write("                    letter-spacing: 1px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form-control:focus {\n");
      out.write("                    border: 0.5px solid #dc354575;\n");
      out.write("                    border-radius: 30px;\n");
      out.write("                    box-shadow: none;\n");
      out.write("                    background-color: rgba(0, 0, 0, .075);\n");
      out.write("                    color: #000;\n");
      out.write("                    letter-spacing: 1px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .btn {\n");
      out.write("                    display: block;\n");
      out.write("                    width: 100%;\n");
      out.write("                    border-radius: 30px;\n");
      out.write("                    border: none;\n");
      out.write("                    background: linear-gradient(to right, rgba(249, 0, 104, 1) 0%, rgba(247, 117, 24, 1) 100%);\n");
      out.write("                    background: -webkit-linear-gradient(left, rgba(249, 0, 104, 1) 0%, rgba(247, 117, 24, 1) 100%)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .text-left {\n");
      out.write("                    color: rgba(0, 0, 0, 0.3);\n");
      out.write("                    font-weight: 400\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .text-right {\n");
      out.write("                    color: #ff0147;\n");
      out.write("                    font-weight: bold\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                span.text-center {\n");
      out.write("                    color: rgba(0, 0, 0, 0.3)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fab {\n");
      out.write("                    padding: 15px;\n");
      out.write("                    font-size: 23px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fa-facebook {\n");
      out.write("                    color: #0303d9bf\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fa-twitter {\n");
      out.write("                    color: #0078fade\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fa-linkedin {\n");
      out.write("                    color: #18b1c0\n");
      out.write("                }\n");
      out.write("                .bordert {\n");
      out.write("                    border-top: 1px solid #aaa;\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .bordert:after {\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: -13px;\n");
      out.write("                    left: 33%;\n");
      out.write("                    background-color: #fff;\n");
      out.write("                    padding: 0px 8px;\n");
      out.write("                }\n");
      out.write("                img {\n");
      out.write("                    width: 50px;\n");
      out.write("                    height: 50px;\n");
      out.write("                    object-fit: cover;\n");
      out.write("                    border-radius: 50%;\n");
      out.write("                    position: relative;\n");
      out.write("                    margin-left: 15px;\n");
      out.write("                }\n");
      out.write("                .form-group.checkbox-group {\n");
      out.write("                    display: flex;\n");
      out.write("                    align-items: center;\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=\"checkbox\"] {\n");
      out.write("                    margin: 0;\n");
      out.write("                    margin-right: 5px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                label.checkbox-label {\n");
      out.write("                    color: rgba(0, 0, 0, 0.3);\n");
      out.write("                    font-weight: 400;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 mx-auto py-4 px-0\">\n");
      out.write("                        <div class=\"card p-0\">\n");
      out.write("                            <div class=\"card-title text-center\">\n");
      out.write("                                <h5 class=\"mt-5\">HEY, THERE</h5> <small class=\"para\">Login to your cool account below.</small>\n");
      out.write("                            </div>\n");
      out.write("                            <form class=\"signup\" action=\"MainController\" method=\"POST\">\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"UserID\" required class=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Password\" required class=\"\">\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"form-group checkbox-group\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"remember\" id=\"rememberMe\"> \n");
      out.write("                                    <label for=\"rememberMe\" class=\"checkbox-label\">Remember me</label>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" name=\"action\" class=\"btn btn-primary\" value=\"Login\"/>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-6 col-sm-6\">\n");
      out.write("                                        <a href=\"#\"><p class=\"text-left pt-2 ml-1\">Forgot password?</p></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6 col-sm-6\">\n");
      out.write("                                        <a href=\"create.jsp\"> <p class=\"text-right pt-2 mr-1\">Sign Up Now</p></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <span class=\"text-center\">Or</span> <span class=\"text-center pt-3\">Login Using</span>\n");
      out.write("                                <div class=\"mx-3 my-2 py-2 bordert\">\n");
      out.write("                                    <div class=\"text-center py-3\"> <a href=\"create.jsp\" target=\"_blank\" class=\"px-2\">\n");
      out.write("                                            <img src=\"https://www.dpreview.com/files/p/articles/4698742202/facebook.jpeg\" alt=\"\">\n");
      out.write("                                        </a> <a href=\"create.jsp\" target=\"_blank\" class=\"px-2\"> <img\n");
      out.write("                                                src=\"https://www.freepnglogos.com/uploads/google-logo-png/google-logo-png-suite-everything-you-need-know-about-google-newest-0.png\"\n");
      out.write("                                                alt=\"\"> </a> <a href=\"create.jsp\" target=\"_blank\" class=\"px-2\"> <img\n");
      out.write("                                                src=\"https://png.pngtree.com/png-vector/20221018/ourmid/pngtree-twitter-social-media-round-icon-png-image_6315985.png\"\n");
      out.write("                                                alt=\"\"> </a> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
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
