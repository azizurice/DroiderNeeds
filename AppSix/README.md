## AppSix - An app that shows usage of Service.

### Service
  A [Service](https://developer.android.com/reference/android/app/Service.html) is an app component that is used to perform long-running tasks (perform file I/O, network transactions, play music, or interact with a content provider, etc) in the background. It does not provide an UI and is started by another app component (e.g., Activity).

  There are two kinds of service:
  1. started -- This service is started by calling startService() from app component; but can run in the background indefinitely even after the calling component is destroyed.

  2. Bound -- A component can bind with Bound Service by calling bindService(). This service runs only as long as the calling component does not unbound it.


### How to create a service
   To create a service, we must create a subclass of [Service or any its subclasess](https://developer.android.com/reference/android/app/Service.html) and need to override some of its callback methods. We should override at least following important ones:

   I.   onStartCommand()
   II.  onBind()
   III. onCreate()
   IV.  OnDestroy()

   Note: Service class runs in the application main thread, by default. So we need to create a new thread inside the service if we want to avoid blocking/performance issues.However,  IntentService, one subclass of Service uses worker thread. If we don't require that our service handles multiple request simultaneously. It is better to create our own service by extending IntentSerive. However, if we want multi-threading, we should extend from Service class. Please visit [here](https://developer.android.com/reference/android/app/Service.html) for more details.
