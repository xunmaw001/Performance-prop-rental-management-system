<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
			z-index: -1;
		}
		#swiper {
			overflow: hidden;
			margin: 0 auto;
		}
		#swiper .layui-carousel-ind li {
			width: 16px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 3px;
			background-color: #f7f7f7;
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 24px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 0;
			background-color: rgba(198, 161, 106, 1);
			box-shadow: 0 0 0px rgba(198, 161, 106, 1);
		}
		
		button, button:focus {
			outline: none;
		}
		
		.data-add-container .add .layui-select-title .layui-unselect {
			padding: 0 12px;
			height: 40px;
			font-size: 14px;
			color: #333;
			border-radius: 4px;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(230, 186, 89, 1);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(110,22,64,.0);
			text-align: left;
		}
		.data-add-container .add .layui-form-item {
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
			margin: 0;
			position: inherit;
			background: transparent;
			border: 0;
		}
		.data-add-container .add .layui-input-block {
			margin: 0;
			flex: 1;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
			margin: 0;
			flex: 1;
			display: flex;
		}
	</style>
	<body>


		<div id="app">
		
			<!-- 轮播图 -->
			<!-- <div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div> -->
			<div class="layui-carousel" id="swiper" :style='{"boxShadow":"0 0 0px rgba(110,22,64,0)","margin":"0px auto ","borderColor":"rgba(240, 240, 240, 1)","borderRadius":"0px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
			  <div carousel-item id="swiper-item">
				<div v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="item.img" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->
		
			<div class="data-add-container">
		
				<form class="layui-form layui-form-pane" lay-filter="myForm">
					
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">订单编号：</label>
						<div class="layui-input-block">
							<input v-model="detail.dingdanbianhao" type="text" :readonly="ro.dingdanbianhao" name="dingdanbianhao" id="dingdanbianhao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">道具名称：</label>
						<div class="layui-input-block">
							<input v-model="detail.daojumingcheng" type="text" :readonly="ro.daojumingcheng" name="daojumingcheng" id="daojumingcheng" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">道具类型：</label>
						<div class="layui-input-block">
							<input v-model="detail.daojuleixing" type="text" :readonly="ro.daojuleixing" name="daojuleixing" id="daojuleixing" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">账号：</label>
						<div class="layui-input-block">
							<input v-model="detail.zhanghao" type="text" :readonly="ro.zhanghao" name="zhanghao" id="zhanghao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">租赁价格：</label>
						<div class="layui-input-block">
							<input v-model="detail.zulinjiage" type="text" :readonly="ro.zulinjiage" name="zulinjiage" id="zulinjiage" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">数量：</label>
						<div class="layui-input-block">
							<input v-model="detail.shuliang" type="text" :readonly="ro.shuliang" name="shuliang" id="shuliang" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">租赁天数：</label>
						<div class="layui-input-block">
							<input v-model="detail.zulintianshu" type="text" :readonly="ro.zulintianshu" name="zulintianshu" id="zulintianshu" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">总价格：</label>
						<div class="layui-input-block">
							<input v-model="zongjiage" type="text" name="zongjiage" id="zongjiage" disabled="disabled" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">租赁时间：</label>
						<div class="layui-input-block">
							<input type="text" name="zulinshijian" id="zulinshijian" autocomplete="off" class="layui-input" >
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">用户名：</label>
						<div class="layui-input-block">
							<input v-model="detail.yonghuming" type="text" :readonly="ro.yonghuming" name="yonghuming" id="yonghuming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">姓名：</label>
						<div class="layui-input-block">
							<input v-model="detail.xingming" type="text" :readonly="ro.xingming" name="xingming" id="xingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">手机：</label>
						<div class="layui-input-block">
							<input v-model="detail.shouji" type="text" :readonly="ro.shouji" name="shouji" id="shouji" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">地址：</label>
						<div class="layui-input-block">
							<input v-model="detail.dizhi" type="text" :readonly="ro.dizhi" name="dizhi" id="dizhi" autocomplete="off" class="layui-input">
						</div>
					</div>
		            
		
					<div class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					baseurl: '',
					dataList: [],
					ro:{
                                        dingdanbianhao : false,
                                        daojumingcheng : false,
                                        daojuleixing : false,
                                        zhanghao : false,
                                        zulinjiage : false,
                                        shuliang : false,
                                        zulintianshu : false,
                                        zongjiage : false,
                                        zulinshijian : false,
                                        yonghuming : false,
                                        xingming : false,
                                        shouji : false,
                                        dizhi : false,
                                        ispay : false,
					},
                    detail: {
                        dingdanbianhao: genTradeNo(),
                        daojumingcheng: '',
                        daojuleixing: '',
                        zhanghao: '',
                        zulinjiage: '',
                        shuliang: '',
                        zulintianshu: '',
                        zongjiage: '',
                        zulinshijian: '',
                        yonghuming: '',
                        xingming: '',
                        shouji: '',
                        dizhi: '',
                        ispay: '',
                    },
					centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {
                    zongjiage:{
                    get: function () {
                        return 1*this.detail.zulinjiage*this.detail.shuliang*this.detail.zulintianshu
                    }
                    },
                },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})


			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
				var tinymce = layui.tinymce;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img style="width: 100%;height: 100%;object-fit:cover;" class="swiper-item" src="' + http.baseurl+item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						vue.$nextTick(() => {
						  carousel.render({
						  	elem: '#swiper',
							width: '100%',
						  	height: '450px',
						  	arrow: 'hover',
						  	anim: 'default',
						  	autoplay: 'true',
						  	interval: '3000',
						  	indicator: 'inside'
						  });
						
						})
					}
				});

                                jquery('#zulinshijian').val(getCurDateTime());
				laydate.render({
					elem: '#zulinshijian',
					type: 'datetime'
				});
				
                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
                        if(key=='yonghuming'){
                                vue.detail['yonghuming'] = data[`${key}`]
                                vue.ro.yonghuming = true;
                                continue;
                        }
                        if(key=='xingming'){
                                vue.detail['xingming'] = data[`${key}`]
                                vue.ro.xingming = true;
                                continue;
                        }
                        if(key=='shouji'){
                                vue.detail['shouji'] = data[`${key}`]
                                vue.ro.shouji = true;
                                continue;
                        }
					}
				});

                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var o in obj){
                                        if(o=='dingdanbianhao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.dingdanbianhao = true;
                                                continue;
                                        }
                                        if(o=='daojumingcheng'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.daojumingcheng = true;
                                                continue;
                                        }
                                        if(o=='daojuleixing'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.daojuleixing = true;
                                                continue;
                                        }
                                        if(o=='zhanghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhanghao = true;
                                                continue;
                                        }
                                        if(o=='zulinjiage'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zulinjiage = true;
                                                continue;
                                        }
                                        if(o=='shuliang'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.shuliang = true;
                                                continue;
                                        }
                                        if(o=='zulintianshu'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zulintianshu = true;
                                                continue;
                                        }
                                        if(o=='zongjiage'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zongjiage = true;
                                                continue;
                                        }
                                        if(o=='zulinshijian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zulinshijian = true;
                                                jquery('#zulinshijian').val(obj[o]);
                                                continue;
                                        }
                                        if(o=='yonghuming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.yonghuming = true;
                                                continue;
                                        }
                                        if(o=='xingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.xingming = true;
                                                continue;
                                        }
                                        if(o=='shouji'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.shouji = true;
                                                continue;
                                        }
                                        if(o=='dizhi'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.dizhi = true;
                                                continue;
                                        }
					}
				}
				
				vue.detail.shuliang = 0
				vue.ro.shuliang = false;

				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
                    if(!data.daojumingcheng){
                        layer.msg('道具名称不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!data.daojuleixing){
                        layer.msg('道具类型不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!data.zulinjiage){
                        layer.msg('租赁价格不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.zulinjiage)){
                        layer.msg('租赁价格应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!data.shuliang){
                        layer.msg('数量不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.shuliang)){
                        layer.msg('数量应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!data.zulintianshu){
                        layer.msg('租赁天数不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.zulintianshu)){
                        layer.msg('租赁天数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.zongjiage)){
                        layer.msg('总价格应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!data.dizhi){
                        layer.msg('地址不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }

					// 跨表计算判断
                    var obj = JSON.parse(localStorage.getItem('crossObj'));
                    obj.shuliang = obj.shuliang - data.shuliang
                    if(obj.shuliang<0){
                        layer.msg(`数量不足`, {
					 		time: 2000,
					 		icon: 5
					 	});
                        return false
                    }
					
                    // 比较大小

                //更新跨表属性
               var crossuserid;
               var crossrefid;
               var crossoptnum;
                if(http.getParam('corss')){
                        var statusColumnName = localStorage.getItem('statusColumnName');
                        var statusColumnValue = localStorage.getItem('statusColumnValue');
                        if(statusColumnName!='') {
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
				if(!statusColumnName.startsWith("[")) {
					for (var o in obj){
						if(o==statusColumnName){
							obj[o] = statusColumnValue;
						}
					}
					var table = localStorage.getItem('crossTable');
					http.requestJson(`${table}/update`,'post',obj,(res)=>{});
				} else {
                                       crossuserid=Number(localStorage.getItem('userid'));
                                       crossrefid=obj['id'];
                                       crossoptnum=localStorage.getItem('statusColumnName');
                                       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
				}
                        }
                }
                        if(crossrefid && crossuserid) {
                                data.crossuserid=crossuserid;
                                data.crossrefid=crossrefid;
                                http.request('zulindingdan/list', 'get', {
                                        page: 1,
                                        limit: 10,
                                        crossuserid:crossuserid,
                                        crossrefid:crossrefid,
                                }, function(res) {
                                        if(res.data.total>=crossoptnum) {
                                                layer.msg(localStorage.getItem('tips'), {
                                                        time: 2000,
                                                        icon: 6
                                                })
                                             return false;
                                        } else {
                                            // 跨表计算
                                            var obj = JSON.parse(localStorage.getItem('crossObj'));
                                            var table = localStorage.getItem('crossTable');
                                            obj.shuliang = obj.shuliang - data.shuliang
                                            http.requestJson(`${table}/update`,'post',obj,(res)=>{});
                                            // 提交数据
                                            http.requestJson('zulindingdan' + '/add', 'post', data, function(res) {
                                                    layer.msg('提交成功', {
                                                            time: 2000,
                                                            icon: 6
                                                    }, function() {
                                                            back();
                                                    });
                                             });
                                        }
                                });
                        } else {
                                // 跨表计算
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
                                var table = localStorage.getItem('crossTable');
                                obj.shuliang = obj.shuliang - data.shuliang
                                http.requestJson(`${table}/update`,'post',obj,(res)=>{});
                                // 提交数据
                                http.requestJson('zulindingdan' + '/add', 'post', data, function(res) {
                                        layer.msg('提交成功', {
                                                time: 2000,
                                                icon: 6
                                        }, function() {
                                                back();
                                        });
                                 });
                        }
			return false
			});
		});
		</script>
	</body>
</html>
