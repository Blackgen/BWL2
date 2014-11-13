<%--
  Created by IntelliJ IDEA.
  User: patrick_steinhauer
  Date: 31.10.2014
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Webshop</title>
    <link rel="stylesheet" type="text/css" href="/resources/style.css" />
</head>
<body>
<div class="wrapper">
    <header>
        <div class="innerholder">
            <nav class="clearfix">
                <ul>
                    <li>
                        <a href="productCategories.html">
                            Produktebenen
                        </a>
                        <ul>
                            <li>
                                <a href="cpu.html">
                                    CPU
                                </a>
                            </li>
                            <li>
                                <a href="ram.html">
                                    RAM
                                </a>
                            </li>
                            <li class="last">
                                <a href="mainboard.html">
                                    Mainboard
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="kontoeinstellungen.html">
                            Kontoeinstellungen
                        </a>
                        <ul>
                            <li>
                                <a href="meinkonto.html">
                                    Mein Konto
                                </a>
                            </li>
                            <li>
                                <a href="meinebestellungen.html">
                                    Meine Bestellungen
                                </a>
                            </li>
                            <li>
                                <a href="logout.html">
                                    Abmelden
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        Einkaufswagen
                    </li>
                </ul>
            </nav>
            <div class="searchfield clearfix">

                <span>
                    Suche
                </span>
                <input type="text" placeholder="Suche">
            </div>
        </div>
    </header>
    <div class="mainwindow">
        <div class="innerholder">

        </div>
    </div>
</div>
<footer>
    <div class="innerholder">

    </div>
</footer>
</body>
</html>