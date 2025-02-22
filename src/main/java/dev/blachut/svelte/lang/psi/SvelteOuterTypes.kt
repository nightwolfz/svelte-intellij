package dev.blachut.svelte.lang.psi

import com.intellij.psi.templateLanguages.TemplateDataElementType
import com.intellij.psi.tree.IElementType
import dev.blachut.svelte.lang.SvelteLanguage

import dev.blachut.svelte.lang.psi.SvelteTypes.HTML_FRAGMENT

// TODO Merge with generated SvelteTypes if possible
object SvelteOuterTypes {
    val SVELTE_FRAGMENT: IElementType = SvelteElementType("SVELTE_FRAGMENT")
    val SVELTE_HTML_TEMPLATE_DATA: IElementType = TemplateDataElementType("SVELTE_HTML_TEMPLATE_DATA", SvelteLanguage.INSTANCE, HTML_FRAGMENT, SVELTE_FRAGMENT)
}
