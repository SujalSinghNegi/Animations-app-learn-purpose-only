# Types of Animations
## 1. Local animation
a) Create anim folder inside res, then create your animation like fade_in.xml
```
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/linear_interpolator"
    >
<alpha
    android:duration="1000"
    android:toAlpha="0.1"
    android:fromAlpha="1.0"
  />

</set>
```
b) inside the xml create a view called textview and a button called fadeIn

c) Inside MainActivity.kt

```
  binding.fadeIn.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.fade_in)
            binding.textview.startAnimation(anim)
        }
```

## 2. Online Animation
a.1) Inside the Dependency

       implementation ("com.github.gayanvoice:android-animations-kotlin:1.0.1")

a.2) In settings.gradle.kts ,  below the mavenCentral()

        maven {
            url = uri("https://jitpack.io")
        }

b) create a textview and the btn in xml

c) inside the MainActivity.kt file
    
    // to import all animation 
    import render.animations.*

        val targetView = binding.targetView
        binding.btnInDown.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InDown(targetView))
            render.start()
        }

#### Note -> Bounce() is the class name, and InDown is the animation name associated with it
Class Name and animation corespondiing to it are: 


| Class Name  | Animation Types                                                                 |
|-------------|----------------------------------------------------------------------------------|
| Attention   | Bounce, Flash, Pulse, Ruberband, Shake, Standup, Swing, Tada, Wave, Wobble     |
| Bounce      | InDown, InUp, InLeft, InRight, In                                               |
| Fade        | InDown, InUp, InLeft, InRight, OutDown, OutUp, OutLeft, OutRight, In, Out      |
| Flip        | InX, InY, OutX, OutY                                                            |
| Rotate      | InDownLeft, InDownRight, InUpLeft, InUpRight, OutDownLeft, OutDownRight, OutUpLeft, OutUpRight, In, Out |
| Slide       | InDown, InUp, InLeft, InRight, OutDown, OutUp, OutLeft, OutRight               |
| Zoom        | In, InDown, InUp, InLeft, InRight, Out, OutDown, OutUp, OutLeft, OutRight      |

        
