package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import code.lib._
import Helpers._

import net.liftweb._
import common.{Full, Box}
import http._
import xml.{NodeSeq, Null, UnprefixedAttribute, MetaData}

import scala.xml._

import net.liftweb._
import common._
import http._


object error_test extends LiftScreen {
  

  val flavor = field(S ? "flavor", "", trim,
    valMinLen(2, "Name too short"),
    valMaxLen(6, "That's a long name"))

val flavor2 = field(S ? "flavor (with ("id" -> "flavor2_id"))", "", trim,
    valMinLen(2, "Name too short"),
    valMaxLen(6, "That's a long name"),
("id" -> "flavor2_id")
)


  val age = field("Age", 0, minVal(13, "Too Young"))




  def finish() {
    S.notice("I like  too!")
  }

}
