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
a) Inside the Dependency

       implementation ("com.github.gayanvoice:android-animations-kotlin:1.0.1")

b) 
       

        val targetView = binding.targetView
        binding.btnInDown.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InDown(targetView))
            render.start()
        }

        
