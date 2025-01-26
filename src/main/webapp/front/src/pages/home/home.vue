<template>
<div class="home-preview" :style='{"width":"1200px","margin":"20px auto 20px","flexWrap":"wrap","justifyContent":"space-between","display":"flex"}'>



<div class="recommend" :style='{"border":"1px solid #dfdfdf","boxShadow":"1px 2px 3px #eee","margin":"20px 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","height":"auto","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px center,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px center"}'>
		<span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>公告信息推荐</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 10px","background":"#fff","height":"auto"}'>
		<div :style='{"margin":"10px","borderRadius":"8px","background":"none","display":"inline-block","width":"274px","position":"relative","height":"auto"}' v-for="(item,index) in gonggaoxinxiRecommend" :key="index" @click="toDetail('gonggaoxinxiDetail', item)" class="list-item animation-box">
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>{{item.biaoti}}</div>
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>班级:{{item.banji}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('gonggaoxinxi')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"20px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"#fff","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>
<div class="recommend" :style='{"border":"1px solid #dfdfdf","boxShadow":"1px 2px 3px #eee","margin":"20px 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","height":"auto","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px center,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px center"}'>
		<span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>实验信息推荐</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 10px","background":"#fff","height":"auto"}'>
		<div :style='{"margin":"10px","borderRadius":"8px","background":"none","display":"inline-block","width":"274px","position":"relative","height":"auto"}' v-for="(item,index) in shiyanxinxiRecommend" :key="index" @click="toDetail('shiyanxinxiDetail', item)" class="list-item animation-box">
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>{{item.shiyanmingcheng}}</div>
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>{{item.banji}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('shiyanxinxi')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"20px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"#fff","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>
<div class="recommend" :style='{"border":"1px solid #dfdfdf","boxShadow":"1px 2px 3px #eee","margin":"20px 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","height":"auto","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px center,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px center"}'>
		<span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>班级讨论推荐</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 10px","background":"#fff","height":"auto"}'>
		<div :style='{"margin":"10px","borderRadius":"8px","background":"none","display":"inline-block","width":"274px","position":"relative","height":"auto"}' v-for="(item,index) in banjitaolunRecommend" :key="index" @click="toDetail('banjitaolunDetail', item)" class="list-item animation-box">
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
			<img :style='{"cursor":"pointer","border":"1px solid #ddd","objectFit":"contain","borderRadius":"8px","background":"#fff","display":"block","width":"100%","height":"274px"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>{{item.biaoti}}</div>
			<div class="name line1" :style='{"cursor":"pointer","padding":"4px 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","background":"#f5f5f5","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis"}'>班级:{{item.banji}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('banjitaolun')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"20px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"#fff","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>

	




</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        gonggaoxinxiRecommend: [],
        shiyanxinxiRecommend: [],
        banjitaolunRecommend: [],

      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "gonggaoxinxi/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 8,
			}}).then(res => {
				if (res.data.code == 0) {
					this.gonggaoxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "shiyanxinxi/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 8,
			}}).then(res => {
				if (res.data.code == 0) {
					this.shiyanxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "banjitaolun/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 8,
			}}).then(res => {
				if (res.data.code == 0) {
					this.banjitaolunRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
