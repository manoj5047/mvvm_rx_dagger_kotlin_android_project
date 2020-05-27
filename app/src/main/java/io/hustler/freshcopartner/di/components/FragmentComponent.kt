package io.hustler.freshcopartner.di.components

import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationSettingsResponse
import com.google.android.gms.tasks.Task
import io.hustler.freshcopartner.di.scopes.ActivityScope
import io.hustler.freshcopartner.di.scopes.FragmentScope
import io.hustler.freshcopartner.ui.home.frags.ContactFragment
import io.hustler.freshcopartner.ui.home.frags.HomeFragment
import io.hustler.freshcopartner.ui.home.frags.OrdersFragment
import dagger.Component
import io.hustler.freshcopartner.di.modules.FragmentModule

//import ph.bilidito..driver.di.modules.FragmentModule

////import ph.bilidito..driver.di.modules.FragmentModule
////import ph.bilidito..driver.di.scopes.ActivityScope
////import ph.bilidito..driver.di.scopes.FragmentScope
////import ph.bilidito..driver.ui.home.fragments.EarningsFragmentV2
////import ph.bilidito..driver.ui.home.fragments.HomeFragment
////import ph.bilidito..driver.ui.home.fragments.TripsFragmentV2

@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
@FragmentScope
@ActivityScope
interface FragmentComponent {
    fun injectHomeFragment(fragment: HomeFragment)
    fun providesLocationRequest(): LocationRequest
    fun provideLocationSettingsRequestTask(): Task<LocationSettingsResponse>
    fun inject(contactFragment: ContactFragment)
    fun inject(ordersFragment: OrdersFragment)

}