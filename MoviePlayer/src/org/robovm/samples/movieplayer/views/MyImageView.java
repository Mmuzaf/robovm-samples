/*
 * Copyright (C) 2014 Trillian Mobile AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * Portions of this code is based on Apple Inc's MoviePlayer sample (v1.5)
 * which is copyright (C) 2008-2014 Apple Inc.
 */
package org.robovm.samples.movieplayer.views;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSSet;
import org.robovm.apple.uikit.UIEvent;
import org.robovm.apple.uikit.UIImageView;
import org.robovm.apple.uikit.UITouch;
import org.robovm.apple.uikit.UITouchPhase;
import org.robovm.samples.movieplayer.viewcontrollers.MyLocalMovieViewController;

public class MyImageView extends UIImageView {
    private MyLocalMovieViewController viewController;

    public MyImageView() {
    }

    public MyImageView(CGRect rect) {
        super(rect);
    }

    public void setMovieViewController(MyLocalMovieViewController viewController) {
        this.viewController = viewController;
    }

    /** Touches to the Image view will start the movie playing. */
    @Override
    public void touchesBegan(NSSet<UITouch> touches, UIEvent event) {
        UITouch touch = touches.any();
        if (touch.getPhase() == UITouchPhase.Began) {
            /* Play the movie! */
            viewController.playLocalMovieFile();
        }
    }
}
