package com.gmall.data.common.entity.ods.gmall2021

import com.gmall.data.common.entity.ods
import com.gmall.data.common.entity.ods.OdsModel
import com.gmall.data.common.entity.ods.SqlType.SqlType
import scala.collection.mutable

// IMPORTANT!!! Don't do any changes, this is auto-generated by OdsModelGenerator
class CouponRange extends OdsModel {
  override var database: String            = _
  override var table   : String            = _
  override var ts      : Long              = _
  override var sqlType : ods.SqlType.Value = _
  override var old     : mutable.Map[String, String] = _
  var id: String = _
var coupon_id: String = _
var range_type: String = _
var range_id: String = _

  def this(database: String, table: String, sqlType: SqlType, ts: Long, old: mutable.Map[String, String]) {
    this()
    this.database = database
    this.table = table
    this.sqlType = sqlType
    this.ts = ts
    this.old = old
  }

  override def toString = s"CouponRange(database=$database, table=$table, sqlType=$sqlType, ts=$ts, old=$old, id=${id}, coupon_id=${coupon_id}, range_type=${range_type}, range_id=${range_id})"

}
