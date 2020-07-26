# pygeon

We created this app using Android Studio’s native Java framework. We used a RelativeLayout to position our elements by margin from the top of the screen for a responsive design. Our start screen uses shape drawables to style the buttons on the screen as well through our activity_main.xml.

For our stages, we used Fragments, or a small portion of a user interface that is hosted in an activity. These helped us keep our stage UI clean for the user. The text below was styled using drawables we made and formatted in a similar style to our RelativeLayout.

Our images were made using ImageView. To support backwards compatibility, we had to use a series of layer-lists to resize the images. From there, we were able to use our hand-drawn assets.

The battle quiz was a really fun thing to work on, as it was to test out. We created hp and enemyHP variables that would track how far a user got through their quiz. Correct answers would reward three points and call another instance of our loadQuestions function, while incorrect answers would regenerate two points of health to the enemy. We used drawableLeft to align icons to the left of the button, which helped gamify the quiz more as it casted spells.

