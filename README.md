# How to use

### 1. 
Just add line given below in project Level gradle file under allprojects-> repositories.
<br>
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
        
    }
}
```
![alt text](https://github.com/HemangNakarani/Authenticate/blob/master/Screenshot%20(134).png)

<br>

### 2. 
Then add this ***implementation 'com.github.HemangNakarani:Authenticate:1.1'*** dependency in app level gradle file.

```
dependencies {

    implementation 'com.github.HemangNakarani:Authenticate:1.1'
    
}
```
![alt text](https://github.com/HemangNakarani/Authenticate/blob/master/Screenshot%20(133).png)

<br>

### 3.

Where you want to use authentication then create ***Auth_It*** object and call function ***Authenticate*** there. 
![alt text](https://github.com/HemangNakarani/Authenticate/blob/master/Screenshot%20(135).png)
