# Rick-and-Morty-Android-App
Step 1: Create a New Project in Android Studio     
Step 2: Add these dependencies in Build.gradle(app) file
// retrofit
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.3.0'

// circular image view
implementation 'de.hdodenhof:circleimageview:3.1.0'
    
// glide library for image processing
implementation 'com.github.bumptech.glide:glide:4.13.2'

Step 3: Generate data classes
Right-click on the root package and choose 'New -> Kotlin Data Class from JSON.' If you don't have this plugin installed, navigate to 'File -> Settings -> Plugins' and install the 'JSON to Kotlin' plugin. Copy the JSON response from the API, paste it in the editor, and save the file with a suitable name. The IDE will then generate two data classes based on the provided JSON structure

data class RickMorty( 
    val results: List<Result> 
)
data class Result( 
    val image: String, 
    val name: String, 
)

Step 4: Create API interface and retrofit instance 
This Kotlin interface named RickApi declares a single method named getDetails, annotated with @GET. The annotation indicates that the method is intended to execute an HTTP GET request to the designated endpoint, which, in this instance, is set to 'character

Step 5: Design layout Files
Go to the 'app' directory, then navigate to 'res' > 'layout' > 'activity_main.xml'. Insert the provided code snippet into that XML file.     
Step 6: Create an Adapter class for RecyclerView    
Step 7: Implement MainActivity.kt file
