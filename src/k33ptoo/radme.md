1. KButton
   KButton is an extended version of JButton – it has basically everything else a JButton has, that said we will look only the custom properties. Example

Custom Properties

kAllowGradient(Boolean) Enables or disables gradient property of the button.
kBackgroundColor(Color) Gets or sets the background color of the button.
kBorderRadius(int) Gets or sets the radius of a button (recommended 0 to 30).
kEndColor(Color) Gets or sets the button’s gradient end color to the right.
kFillButton(boolean) Allows the button to be filled or not with color/gradient
kForeGround(Color) Gets or sets the component’s label.
kHoverColor(Color) Gets or sets the color of the control when a mouse is hovered over it.
kHoverEndColor(Color) Gets or sets the button’s gradient end color when it receives a mouse hover event.
kHoverForeGround(Color) Gets or sets the button’s label color when it receives a mouse hover event.
kHoverStartColor(Color) Gets or sets the button’s gradient start color when it receives a mouse hover event.
kPressedColor(Color) Gets or sets the button’s color when it receives a mouse click event.
kStartcolor(Color) Gets or sets the button’s gradient end color to the left.
kAllowTab(boolean) Gets or sets the button’s tab property by making kButtons have a tab–like feature.
kIndicatorColor(Color) Gets or sets the button’s indicator color.
kIndicatorThickness(int) Gets or sets the button’s indicator thickness.
States & Properties
(Properties to watch out for quicker UI designing)

Hover State
kHoverColor(Color)
kHoverEndColor(Color)
kHoverForeGround(Color)
kHoverStartColor(Color
Normal State
kAllowGradient(Boolean)
kBackgroundColor(Color)
kAllowTab(Boolean)
kBorderRadius(int)
kEndColor(Color)
kFillButton(boolean)
kForeGround(Color)
kStartColor(Color)
kPressedColor(Color)
2. KGradientPanel
   This is an extended version of JPanel with awesome gradient effect. Custom properties Example

kEndColor(Color) Gets or sets the button’s gradient end color to the right.
kGradientFocus(int) Gets or sets the location to which the gradient should focus (accepts negative value)
kStartcolor(Color) Gets or sets the button’s gradient end color to the left.
kBorderRadius(int) Gets or sets the radius of a KGradientPanel(recommended 0 to 30).
Frame Resize and Move Utility
What resize and move utility does is, it allows you to drag or resize your undecorated JFrame. So here is how to use it.

private static void resizeMoveFrame(JFrame frame) {
//Resize and move
SwingUtilities.invokeLater(() -> {

         //Drag around your frame using below

         ComponentMoverUtil.moveFrame(frame, false, frame.getComponents());

        // Use below if you want to resize your frame
         ComponentResizerUtil cr = new ComponentResizerUtil();
         frame.getRootPane().setBorder(new LineBorder(Color.gray));
         cr.setSnapSize(new Dimension(5, 5));
         cr.setDragInsets(new Insets(5, 5, 5, 5));
       
         //always register frame to resize
         cr.registerComponent(frame); 

     });
}
Download Jar Here Thank you.