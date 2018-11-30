<#if x == 1>
    <#import "layout/defaultLayout.ftl" as layouts>
<#else>
    <#import "layout/defaultLayouts.ftl" as layouts>
</#if>


<@layouts.myLayout "Home page">
<div><h1>Hello Dude</h1></div>
</@layouts.myLayout>