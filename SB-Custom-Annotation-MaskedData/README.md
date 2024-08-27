Creating custom annotation and using that annotation in required fields to get the masking data of required fields

@Target(ElementType.METHOD) // Specifies that the annotation can be applied to methods
@Target(ElementType.FIELD) //  Specifies that the annotation can be applied to fields
@Target({ElementType.METHOD, ElementType.TYPE}) // Can be applied to classes and methods
@Target(ElementType.FIELD, ElementType.METHOD) //  Specifies that the annotation can be applied to fields
@Retention(RetentionPolicy.RUNTIME) // Makes the annotation available at runtime