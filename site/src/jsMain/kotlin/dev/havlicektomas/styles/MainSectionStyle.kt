package dev.havlicektomas.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import dev.havlicektomas.models.Theme
import org.jetbrains.compose.web.css.deg

val NavigationItemStyle = CssStyle {
    base {
        Modifier
            .color(Theme.Secondary.rgb)
    }
    hover {
        Modifier
            .color(Theme.Primary.rgb)
    }
}

val LogoStyle = CssStyle {
    base {
        Modifier
            .transform { rotate(0.deg) }
    }
    hover {
        Modifier
            .transform { rotate((-10).deg) }
    }
}