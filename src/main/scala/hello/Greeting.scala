package hello


import scala.beans.BeanProperty

class Greeting {
  @BeanProperty
  var id: Long = _
  
  @BeanProperty
  var content: String = _
  
}