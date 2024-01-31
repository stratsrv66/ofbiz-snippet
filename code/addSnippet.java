fun addTemplate(project: Project?, shortcut: String, text: String, group: String){

        val templateSettings = TemplateSettings.getInstance()
        val template = templateSettings.getTemplate(shortcut, group)
        println(templateSettings.getTemplate("!returnError", "ofbiz_java"))

        if (template == null) {
            val newTemplate = TemplateImpl(shortcut, text, group)
            newTemplate.applyContext(templateSettings.getTemplate("!returnError", "ofbiz_java")?.templateContext)
            templateSettings.addTemplate(newTemplate)
        }
}
