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

| Param            |                                              Function                                              |
|------------------|:--------------------------------------------------------------------------------------------------:|
| text             |                                Defines text with default formatting                                |
| modifier         |                       Responsible for general modifications to the component                       |
| customArea       |                 List of areas that will be customized in the text. see:CustomArea                  |
| textStyleDefault |                                         Default text style                                         |
| textColorDefault |                                         Default text color                                         |
| textAlign        | Defines how to align text horizontally. TextAlign controls how text aligns in the space it appears |

## Grids
A support component to guide the construction of screens

```Kotlin
@Composable
fun Grids(
    size: Dp = 8.dp,
    color: Color = Color.Red,
    thickness: Dp = .2.dp,
    enable: Boolean
) 
```

| Param     |                  Function                  |
|-----------|:------------------------------------------:|
| size      |    Size to define the scale of the grid    |
| color     |       Defines the color of the grids       |
| thickness |  Defines the line thickness of the grids   |
| enable    |  Enables or disables the display of grids  |