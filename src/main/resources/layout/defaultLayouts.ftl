<#macro myLayout title="FreeMarker example">
<html>
    <head>
        <title>
        ${title}
            </title>
        
        </head>
    <body style="width:60%;height:80%">
        <table border="1" cellspacing="0" cellpadding="0" style="width:100%;height:100%">
            <tr>
                <td colspan="2">
                    </td>
                </tr>
            <tr>
                <td>
            <#include "menu.ftl"/>
                    </td>
                <td>
            <#nested/>
                    </td>
                </tr>
            <tr>
                <td colspan="2">
                    </td>
                </tr>
            </table>
        </body>
    </html>
</#macro>