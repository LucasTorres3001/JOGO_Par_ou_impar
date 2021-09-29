<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <main>
            <header>
                <h1>JOGO: Par ou Ímpar</h1>
            </header>
            <section>
                <form action="index2.jsp" method="POST" name="formulario" id="formulario" target="Msg">
                    <fieldset>
                        <legend>Par ou Ímpar</legend>
                        <p>
                            <input type="radio" name="opcao" id="Par" title="Par" value="Par"><label for="Par">Par</label>
                            <input type="radio" name="opcao" id="Impar" title="Impar" value="Impar"><label for="Impar">Impar</label>
                        </p>
                        <fieldset>
                            <p>
                                <label for="numero">Digite um número qualquer:</label>
                                <input type="number" name="numero" id="numero" placeholder="Número" required="">
                            </p>
                        </fieldset>
                    </fieldset>
                    <br>
                    <button type="submit" name="jogar" id="jogar" title="Jogar">Jogar</button>
                </form>
                <br>
                <iframe name="Msg" id="msg" height="144" width="676" title="Msg"></iframe>
            </section>
        </main>
    </body>
</html>
