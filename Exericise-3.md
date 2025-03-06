# Exercise 3: 

### a. Can an instance method override a static method?

No, an instance method cannot override a static method. Static methods are associated with the class itself, not instances of the class, while instance methods are associated with objects. Overriding happens with instance methods, and static methods cannot be overridden—they can only be **hidden**.

### b. Can a static method override (hide) an instance method?

No, a static method cannot override an instance method. However, a static method can **hide** an instance method if it has the same name and signature. Static methods are resolved at compile time, while instance methods are resolved at runtime.

### c. Can you override a final instance method?

No, you cannot override a final instance method. In Java, **final** methods cannot be overridden. Once a method is declared `final`, it cannot be changed by any subclass.

### d. Can you override an instance method and make it final?

Yes, you can override an instance method and make it `final`. By doing so, you're preventing any further subclass from overriding that method again. This is a way to create a method that can be overridden once, but not further.

### e. Can you override an instance method and change its return type?

No, you cannot change the return type when overriding a method. In Java, the return type of the overriding method must be the same (or covariant, meaning a subclass type of the return type). Changing the return type will result in a compile-time error.

### f. Can you hide a final static method?

No, you cannot hide a final static method. If a static method is declared `final`, it cannot be hidden by a subclass. The `final` keyword prevents any subclass from redefining or hiding the method.

### g. Can an instance field hide a static field?

No, an instance field cannot hide a static field. Instance fields and static fields belong to different contexts—instance fields belong to objects, while static fields belong to the class. Thus, they can't hide each other, though a field with the same name can be declared in a subclass and cause confusion.

### h. Can a static field hide an instance field?

Yes, a static field can **hide** an instance field if they have the same name. However, the static field will only be accessible via the class and will not affect the instance field's behavior. This can lead to confusion but is allowed by Java.

### i. Can an instance method with public visibility override an instance method with default visibility?

Yes, an instance method with `public` visibility can override an instance method with default (package-private) visibility. The overriding method can have a more permissive access modifier, but it cannot have a more restrictive access modifier. Thus, `public` can override default visibility.

### j. Can an instance method with default visibility override an instance method with public visibility?

No, an instance method with default visibility cannot override an instance method with `public` visibility. The overriding method cannot have a more restrictive access modifier than the overridden method.

### k. Can an instance method with protected visibility override an instance method with default visibility?

Yes, an instance method with `protected` visibility can override an instance method with default visibility. The overriding method can have a more permissive access modifier (like `protected`), but not a more restrictive one.

### l. Can an instance method with default visibility override an instance method with protected visibility?

No, an instance method with default (package-private) visibility cannot override an instance method with `protected` visibility. The overriding method cannot have a more restrictive access modifier than the overridden method.

### m. Based on the last four questions, order the access visibility from the widest to the narrowest (weakest) and state the rule for overriding (instance methods) or hiding (static methods)?

#### Access visibility from widest to narrowest:
1. **public**
2. **protected**
3. **default** (package-private)
4. **private**

#### Rule for overriding (instance methods) or hiding (static methods):
- **Overriding instance methods**: The overriding method must have the same or **wider** visibility than the method being overridden. It cannot have a more restrictive visibility.
- **
