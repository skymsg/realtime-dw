package com.gmall.data.dwd

import com.gmall.data.common.config.KafkaConfig
import com.gmall.data.common.entity.ods.SqlType
import com.gmall.data.common.entity.ods.gmall2021.{OrderDetail, OrderInfo}
import com.gmall.data.common.source.SourceFactory
import com.gmall.data.common.utils.Constants
import org.apache.flink.streaming.api.scala._
import com.gmall.data.dwd.Step._

object StreamTopology {

  def build(kafkaConfig: KafkaConfig)(
    implicit env: StreamExecutionEnvironment): Unit = {

    /**
     * 创建流并分配watermark
     */
    val odsOrderInfoStream   = SourceFactory.createBinlogStream[OrderInfo](kafkaConfig, Constants.ORDER_INFO_TOPIC)
      .filter(_.sqlType == SqlType.INSERT) // 取订单支付事实
      .assignAscendingTimestamps(_.ts)

    val odsOrderDetailStream = SourceFactory.createBinlogStream[OrderDetail](kafkaConfig, Constants.ORDER_DETAIL_TOPIC)
      .filter(_.sqlType == SqlType.INSERT) // 取订单支付事实
      .assignAscendingTimestamps(_.ts)


    // 订单流与订单明细流join
    odsOrderInfoStream
      .joinStream(odsOrderDetailStream)





  }

}
