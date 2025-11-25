buildscript { repositories { google() 
        mavenCentral()
    }
    dependencies { 
        classpath("com.android.tools.build:gradle:8.1.2") 
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }
}
allprojects { repositories { google() 
        mavenCentral()
    }
}
dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
            implementation("com.squareup.okhttp3:okhttp:4.11.0") // add this line
}
}