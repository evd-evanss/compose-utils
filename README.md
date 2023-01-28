# Compose Utils

A set of libraries to make Jetpack Compose easier to use

## Custom Text
A component to customize the text style with different formats

### Format specific area

```Kotlin
CustomText(
    text = "This is a custom text",
    modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
    customArea = listOf(CustomArea(text ="custom text"))
)
```

### Format text when there are two identical words in the same sentence

```Kotlin
CustomText(
    text = "The quick brown fox jumps over the lazy brown dog",
    modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
    customArea = listOf(CustomArea(previousTextReference="lazy", text ="brown"))
)
```