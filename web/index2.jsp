<%@page import="jogo.Jogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%
            Jogo jogo = new Jogo();
            
            String opcao, num_txt;
            short num;
            
            opcao = request.getParameter("opcao");
            num_txt = request.getParameter("numero");
            num = Short.parseShort(num_txt);
            
            jogo.setOpcaoDeJogada(opcao);
            jogo.setNumeroDigitado(num);
            
            out.print(jogo.jogada());
        %>
    </body>
</html>
