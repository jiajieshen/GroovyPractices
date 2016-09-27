package com.fubaisum.groovy.practice.xml

/**
 * Created by sum on 9/25/16.
 */
langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCarthy']

content = ''
langs.each { language, author ->
    fragment = """
    <language name="${language}">
        <author>$author</author>
    </language>
    """

    content += fragment
}

xml = """
<languages>
    ${content}
</languages>
"""
println xml
