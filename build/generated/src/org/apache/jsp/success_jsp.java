package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /* Định dạng chung */\n");
      out.write("            body {\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                color: #333;\n");
      out.write("                font-size: 36px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                animation: fadeInDown 1s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h3 {\n");
      out.write("                color: #777;\n");
      out.write("                font-size: 24px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                animation: fadeInUp 1s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container img {\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container .image-text {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                color: white;\n");
      out.write("                font-size: 24px;\n");
      out.write("                text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);\n");
      out.write("            }\n");
      out.write("            .image-container .line1 {\n");
      out.write("                color: red;\n");
      out.write("                top: 40%; /* Thay đổi giá trị top để điều chỉnh vị trí dòng chữ 1 */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container .line2 {\n");
      out.write("                color: #28a745;\n");
      out.write("                top: 50%; /* Thay đổi giá trị top để điều chỉnh vị trí dòng chữ 2 */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"image-container\">\n");
      out.write("            <img src=\"https://thuthuatnhanh.com/wp-content/uploads/2020/03/hinh-anh-dep-phong-canh.jpg\" alt=\"Your Image\">\n");
      out.write("            <div class=\"image-text line1\">Bạn đã mua hàng thành công!</div>\n");
      out.write("            <div class=\"image-text line2\">Cảm ơn bạn đã tin tưởng!</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
