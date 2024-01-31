private fun downloadTemplates(tf: JTextField) {

        val client = HttpClient(CIO)
        var url = "https://raw.githubusercontent.com/stratsrv66/ofbiz-snippet/main/intellij/ofbiz-java.xml" // Remplacez par l'URL réelle du fichier
        tf.text = "Téléchargement du fichier..."
        // back to the line for the next text

        tf.text = "$url"
        runBlocking {
            val response: HttpResponse = client.get(url)
            val fileContent: ByteArray = response.readBytes()

            File("templates").mkdirs()
            tf.text = "Dossier templates créé"

            File("templates/java.xml").writeBytes(fileContent)
            tf.text = "Fichier téléchargé et sauvegardé dans templates/java.xml"
            println("Fichier téléchargé et sauvegardé dans templates/java.xml")

            // print the absolute path of the file
            tf.text = "Fichier sauvegardé dans : " + File("templates/java.xml").absolutePath
            println("Fichier sauvegardé dans : " + File("templates/java.xml").absolutePath)
        }

        tf.text = "Fichier téléchargé et sauvegardé dans templates/java.xml"

        // https://raw.githubusercontent.com/stratsrv66/ofbiz-snippet/main/intellij/ofbiz-xml.xml
        url = "https://raw.githubusercontent.com/stratsrv66/ofbiz-snippet/main/intellij/ofbiz-xml.xml" // Remplacez par l'URL réelle du fichier
        tf.text = "Téléchargement du fichier..."
        // back to the line for the next text

        tf.text = "$url"

        runBlocking {
            val response: HttpResponse = client.get(url)
            val fileContent: ByteArray = response.readBytes()

            File("templates").mkdirs()
            tf.text = "Dossier templates créé"

            File("templates/xml.xml").writeBytes(fileContent)
            tf.text = "Fichier téléchargé et sauvegardé dans templates/xml.xml"
            println("Fichier téléchargé et sauvegardé dans templates/xml.xml")

            // print the absolute path of the file
            tf.text = "Fichier sauvegardé dans : " + File("templates/xml.xml").absolutePath
            println("Fichier sauvegardé dans : " + File("templates/xml.xml").absolutePath)
        }

        client.close()

        tf.text = "Fichier téléchargé et sauvegardé dans templates/xml.xml"
    }
