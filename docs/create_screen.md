# Créer un écran


## Créer la requête

<procedure title="Trouver le controller" id="find-controller">
    <step>
        <p>Une fois sur un écran déjà existant sur la catégorie dans la-quelle vous voulez déclarer votre écran, récupérez la première partie du lien</p>
        <img src="find-controller-step-1.png"/>
        <p>Ici: <code>facility</code></p>
    </step>
    <step>
        <p>Le dossier <code>controller.xml</code> ce trouve dans le dossier: <code>neogia/NOM_APPLICATION/webapp/NOM_APPLICATION/WEB-INF/controller.xml</code></p>
    </step>
</procedure>

<procedure title="Créer la request-map">
    <step>
        <p>Une fois dans le controller, descendre dans le code jusqu'à la dernière balise: <code>request-map</code></p>
    </step>
    <step>
        <p>Arriver ici, utiliser la snippet <code>!request-map</code></p>
        <img src="snippet-request-map.png"/>
        <p>Cela vous donnera la template d'une request map</p>
        <img src="snippet-request-map-u.png"/>
    </step>
    <step>
        <p>Explication des éléments à remplir sur la template</p>
        <list type="bullet">
        <li>
           <p><code>uri</code> : URL d'accès à la requête</p>
        </li>
        <li>
           <p><code>https</code> : Est-ce que la fonction a besoin d'être appeler de manière sécurisé (<code>false</code> par defaut)</p>
        </li>
        <li>
           <p><code>auth</code> : Est-ce que l'utilisateur a besoins d'être connecté pour appeler cette fonction (<code>false</code> par defaut)</p>
        </li>
        <li>
           <p><code>type</code> : Définir quel 'EventHander' sera appeler par cette fonction</p>
        </li>
        <li>
           <p><code>invoke/value</code> : Méthode appelé</p>
        </li>
        <li>
           <p><code>name</code> : Nom de la réponse retourné par la fonction</p>
        </li>
        </list>
        <note><p>Pour créer un écran le <code>type</code> doit être défini à <code>view</code></p></note>
    </step>
    <step>
        <p>Une fois la requête créée, il faut la rediriger vers la view-map, pour cela il faut garde uniquement les balises <code>security</code> et <code>response type="success"</code></p>
    </step>
</procedure>

## Créer la view-map

<procedure title="Créer la view-map" id="create-view-map">
    <step>
        <p>Dans le controller, déscendez en bas du fichier pour y créer la <code>view-map</code>, pour cela utilisez la snippet <code>!view-map</code></p>
        <img src="snippet-view-map.png"/>
        <p>Cela vous donnera la template d'une view map</p>
        <img src="snippet-view-map-u.png"/>
    </step>
    <step>
        <p>Explication des éléments à remplir de la template</p>
        <list>
            <li>
               <p><code>name</code> : Nom de la vue</p>
            </li>
            <li>
               <p><code>page</code> : URL de la vue</p> 
            </li>
            <li>
               <p><code>type</code> : Type de la vue</p>
            </li>
        </list>
        <note><p>Pour créer un écran le <code>type</code> doit être défini à <code>screen</code></p></note>
    </step>
    <step>
        <p>Une fois la view-map créée, il faut remplir la valeur <code>value</code> avec le nom de la vue</p>
    </step>
</procedure>

