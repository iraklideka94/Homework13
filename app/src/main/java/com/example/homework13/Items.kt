package com.example.homework13

data class Items(
    val id: String,
    val projectId: String? = null,
    val equipmentId: String? = null,
    val status: String,
    val requestedBy: String? = null,
    val acceptedBy: String? = null,
    val author: String,
    val category: String,
    val locations: Location,
    val filters: List<Filter>,
    val type: String,
    val organization: String,
    val address: String,
    val startDate: String? = null,
    val endDate: String? = null,
    val description: String? = null,
    val prolongDates: List<String>,
    val releaseDates: List<String>,
    val isDummy: Boolean,
    val hasDriver: Boolean,
    val overwriteDate: String? = null,
    val metaInfo: String? = null,
    val warehouseId: String? = null,
    val rentalDescription: String? = null,
    val internalTransportations: InternalTransportation,
    val startDateMilliseconds: Long,
    val endDateMilliseconds: Long,
    val equipment: Equipment,
) {
    data class Location(
        val type: String,
        val coordinates: List<Double>
    )

    data class Filter(
        val name: String,
        val value: Value
    ) {
        data class Value(
            val max: Int,
            val min: Int
        )
    }

    data class Equipment(
        val id: String,
        val title: String,
        val invNumber: String,
        val categoryId: String,
        val modelId: String,
        val brandId: String,
        val year: Int? = null,
        val specifications: List<Specification>,
        val weight: Int,
        val additionalSpecifications: String,
        val structureId: String,
        val organizationId: String,
        val beaconType: String? = null,
        val beaconId: String,
        val beaconVendor: String,
        val RFID: String,
        val tag: Tag,
        val telematicBox: String? = null,
        val createdAt: String,
        val specialNumber: String? = null,
        val last_check: String,
        val next_check: String,
        val responsiblePerson: String? = null,
        val testType: String? = null,
        val uniqueEquipmentId: String,
        val bglNumber: String,
        val serialNumber: String? = null,
        val inventory: String? = null,
        val warehouseId: String,
        val trackingTag: String? = null,
        val workingHours: String? = null,
        val navarisCriteria: String? = null,
        val dontSendToAs400: Boolean,
        val model: Model,
        val brand: Model.Brand,
        val category: Category,
        val structure: Structure,
        val wareHouse: String,
        val equipmentMedia: List<EquipmentMedia>,
        val telematics: List<Telematic>,
        val isMoving: Boolean
    ) {
        data class Specification(
            val key: String,
            val value: Any
        )

        data class Tag(
            val date: String,
            val authorName: String,
            val media: List<String>
        )

        data class Model(
            val id: String,
            val name: String,
            val createdAt: String,
            val brand: Brand
        ) {
            data class Brand(
                val id: String,
                val name: String,
                val createdAt: String
            )
        }

        data class Category(
            val id: String,
            val name: String,
            val nameDe: String,
            val createdAt: String,
            val media: List<String>
        )

        data class Structure(
            val id: String,
            val name: String,
            val type: String,
            val color: String
        )

        data class EquipmentMedia(
            val id: String,
            val name: String,
            val files: List<File>,
            val type: String,
            val modelId: String,
            val main: Boolean,
            val modelType: String,
            val createdAt: String
        ) {
            data class File(
                val size: String,
                val path: String
            )
        }

        data class Telematic(
            val timestamp: Long,
            val eventType: String,
            val projectId: String,
            val equipmentId: String,
            val locationName: String,
            val location: Location2,
            val costCenter: String,
            val lastLatitude: Double,
            val lastLongitude: Double,
            val lastLatLonPrecise: Boolean,
            val lastAddressByLatLon: String
        ) {
            data class Location2(
                val type: String,
                val coordinates: List<List<List<List<Double>>>>
            )
        }
    }

    data class InternalTransportation(
        val id: String,
        val projectRequestId: String,
        val pickUpDate: String,
        val deliveryDate: String,
        val description: String,
        val status: String,
        val startDateOption: String,
        val endDateOption: String,
        val pickUpLocation: PickUpLocation,
        val deliveryLocation: DeliveryLocation,
        val provider: String,
        val pickUpLocationAddress: String,
        val deliveryLocationAddress: String,
        val pGroup: String,
        val isOrganizedWithoutSam: Boolean?,
        val templatePGroup: String,
        val pickUpDateMilliseconds: Long,
        val deliveryDateMilliseconds: Long,
        val startDateOptionMilliseconds: Long,
        val endDateOptionMilliseconds: Long
    ) {
        data class PickUpLocation(
            val type: String,
            val coordinates: List<Double>
        )

        data class DeliveryLocation(
            val type: String,
            val coordinates: List<Double>
        )
    }
}
