package com.gmall.data.common.entity.ods.gmall2021

import com.gmall.data.common.entity.ods
import com.gmall.data.common.entity.ods.OdsModel
import com.gmall.data.common.entity.ods.SqlType.SqlType
import scala.collection.mutable

// IMPORTANT!!! Don't do any changes, this is auto-generated by OdsModelGenerator
class SpuSaleAttr extends OdsModel {
  override var database: String            = _
  override var table   : String            = _
  override var ts      : Long              = _
  override var sqlType : ods.SqlType.Value = _
  override var old     : mutable.Map[String, String] = _
  var id: String = _
var spu_id: String = _
var base_sale_attr_id: String = _
var sale_attr_name: String = _

  def this(database: String, table: String, sqlType: SqlType, ts: Long, old: mutable.Map[String, String]) {
    this()
    this.database = database
    this.table = table
    this.sqlType = sqlType
    this.ts = ts
    this.old = old
  }

  override def toString = s"SpuSaleAttr(database=$database, table=$table, sqlType=$sqlType, ts=$ts, old=$old, id=${id}, spu_id=${spu_id}, base_sale_attr_id=${base_sale_attr_id}, sale_attr_name=${sale_attr_name})"

}
