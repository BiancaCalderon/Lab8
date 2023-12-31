import org.jetbrains.kotlin.gradle.internal.kapt.incremental.UnknownSnapshot.classpath

/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    ext {

        // global variables
        kotlin_version = "1.6.10"

        // local variables (use def)
        def androidx_test_version = "1.4.0"
        def arch_version = "2.1.0"
        def appcompat_version = "1.4.1"
        def constraint_layout_version = "2.1.3"
        def coroutines_android_version = "1.5.2"
        def espresso_version = "3.4.0"
        def gson_version = "2.9.0"
        def junit_version = "4.13.2"
        def lifecycle_version = "2.4.1"
        def material_version = "1.5.0"
        def mockito_version = "4.3.1"
        def retrofit_gson_version = "2.9.0"
        def retrofit_version = "2.9.0"
        def truth_version = "1.1.3"
        def room_version = "2.4.1"
        def work_version = "2.7.1"

        libraries = [

            // Coroutines
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_android_version",
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_android_version",

            // Android UI and appcompat
            "androidx.appcompat:appcompat:$appcompat_version",
            "com.google.android.material:material:$material_version",
            "androidx.constraintlayout:constraintlayout:$constraint_layout_version",

            // ViewModel and LiveData
            "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version",
            "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version",

            "androidx.work:work-runtime-ktx:$work_version",

            // Room for database
            "androidx.room:room-ktx:$room_version",

            // network & serialization
            "com.google.code.gson:gson:$gson_version",
            "com.squareup.retrofit2:converter-gson:$retrofit_gson_version",
            "com.squareup.retrofit2:retrofit:$retrofit_version",
        ]

        librariesKapt = [
            "androidx.room:room-compiler:$room_version",
        ]

        librariesDebug = [
            "com.google.truth:truth:$truth_version",
        ]

        testLibraries = [
            "junit:junit:$junit_version",

            // Coroutines testing
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines_android_version",

            // mocks
            "org.mockito:mockito-core:$mockito_version",

            //  Architecture Components testing libraries
            "androidx.arch.core:core-testing:$arch_version"
        ]

        androidTestLibraries = [
            "junit:junit:$junit_version",
            "androidx.test:runner:$androidx_test_version",
            "androidx.test:rules:$androidx_test_version",

            // Espresso
            "androidx.test.espresso:espresso-core:$espresso_version",
            "androidx.test.espresso:espresso-contrib:$espresso_version",
            "androidx.test.espresso:espresso-intents:$espresso_version",

            //  Architecture Components testing libraries
            "androidx.arch.core:core-testing:$arch_version",
            "androidx.work:work-testing:$work_version",

            // Coroutines testing
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines_android_version",
        ]
    }

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:7.1.1"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
